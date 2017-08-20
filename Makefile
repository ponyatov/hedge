LOGO = paper-plane.svg
LOGO = hedgehog.png

.PHONY: icons
icons: \
	app/src/main/res/mipmap-mdpi/ic_launcher.png \
	app/src/main/res/mipmap-mdpi/ic_launcher_round.png \
	app/src/main/res/mipmap-xhdpi/ic_launcher.png \
	app/src/main/res/mipmap-xhdpi/ic_launcher_round.png \
	app/src/main/res/mipmap-xxhdpi/ic_launcher.png \
	app/src/main/res/mipmap-xxhdpi/ic_launcher_round.png \
	app/src/main/res/mipmap-hdpi/ic_launcher.png \
	app/src/main/res/mipmap-hdpi/ic_launcher_round.png

app/src/main/res/mipmap-mdpi/%.png: icon/$(LOGO) Makefile
#	convert -background none -gravity center -resize 48x48 -extent 48x48 $< $@ &
app/src/main/res/mipmap-hdpi/%.png: icon/$(LOGO) Makefile
#	convert -background none -gravity center -resize 72x72 -extent 72x72 $< $@ &
app/src/main/res/mipmap-xhdpi/%.png: icon/$(LOGO) Makefile
#	convert -background none -gravity center -resize 96x96 -extent 96x96 $< $@ &
app/src/main/res/mipmap-xxhdpi/%.png: icon/$(LOGO) Makefile
#	convert -background none -gravity center -resize 144x144 -extent 144x144 $< $@ &
	inkscape -z -export-png=$@ -w 144 -h 144 $<

