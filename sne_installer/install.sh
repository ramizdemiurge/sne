#!/bin/bash
clear
echo "Hi. This is a SNE installer. Needs superuser permissions"
#echo "Требуется подключение к интернету"
echo "This application Requires a Java Runtime Environment."
echo ""

read -p "Press [Enter] key to continue..."
mkdir /tmp/sne_temp
#######################################################

echo "Step 1: Downloading the actual version of the SNE from the GitHub..."
wget -P /tmp/sne_temp https://github.com/ramizdemiurge/sne/raw/master/Jar/SNE_new.jar
wget -P /tmp/sne_temp https://ramizdemiurge.github.io/sne/linux_inst.tar
echo ""

#######################################################

tar -xvf /tmp/sne_temp/linux_inst.tar -C /tmp/sne_temp
#######################################################

echo "Step 2: Making directories..."
mkdir -p /opt/ramizdemiurge
mkdir -p /opt/ramizdemiurge/sne
echo ""
#######################################################

echo "Step 3: Moving files..."
mv /tmp/sne_temp/SNE_new.jar /opt/ramizdemiurge/sne/sne.jar
mv /tmp/sne_temp/sne /bin/sne
mv /tmp/sne_temp/SNE.desktop /usr/share/applications/SNE.desktop
mv /tmp/sne_temp/logo.gif /opt/ramizdemiurge/sne/logo.gif
echo ""
#######################################################

echo "Step 4: Configurating permissions (chmod)..."
chmod +x /opt/ramizdemiurge/sne/sne.jar
chmod +x /bin/sne
#######################################################
rm -rf /tmp/sne_temp
echo "SNE installation is complete. ^_^"
