# SSH Connection
OpenSsh Server is already running on the device. By default, the device is named rainier there is no root password, and no firewall rules. A password can be set using the passwd command.

## SSH over Ethernet
Attach an Ethernet cable for network. Once the connection is done, you can look for the IP address your Router assigned via DHCP, or connect to your device using rainier as a host name: 

```bash
ssh root@rainier
```

## SSH over Wi-Fi

```
ssid: rainier
password: dotnet
```
```bash
ssh root@192.168.200.1
```

## Enable SSH key authentication 

```bash
# Use ssh-keygen on developemnt workstaton to create our SSH key pair and copy to device
ssh-keygen

# Update remote device with authorized keys
cat ~/.ssh/id_rsa.pub | ssh root@rainier 'mkdir -p ~/.ssh && cat >> ~/.ssh/authorized_keys'

# Secure the device public we transferred to authorized keys
chmod 700 .ssh
touch .ssh/authorized_keys
chmod 644 .ssh/authorized_keys
```

## Troubleshooting
Using SCP/SSH results in a REMOTE HOST IDENTIFICATION HAS CHANGED! warning

This means that there is already a different device known with the same IP adress. This happens if you reinstall RoslynOS or you use multiple device. The warning can be resolved by removing the record of the IP adress from the list of known hosts as follows:

```bash
ssh-keygen -R rainier (or device ip)
```