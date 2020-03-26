<!-- #################### meniul principal si sub se afla meniurile secundare ################## -->
<div class="menubar" style="z-index: 997; position: absolute; left:17px; top: 90px; width: 600px; height:21px;" align="left">
	<div class="menudiv" style="z-index: 997;" align="left">
		<a class="menuButton" href="#" onclick="buttonClick(event, 'menu1');" onmouseover="buttonMouseover(event, 'menu1');">Prezentare
		</a><a class="menuButton" href="#" onclick="buttonClick(event, 'menu5');" onmouseover="buttonMouseover(event, 'menu5');">Conexiuni
		</a><a class="menuButton" href="#" onclick="buttonClick(event, 'menu6');" onmouseover="buttonMouseover(event, 'menu6');">Terminale
		</a><a class="menuButton" href="#" onclick="buttonClick(event, 'menu7');" onmouseover="buttonMouseover(event, 'menu7');">Comunitate
		</a><a class="menuButton" href="#" onclick="buttonClick(event, 'menu11');" onmouseover="buttonMouseover(event, 'menu11');">Tarife Port
		</a><a class="menuButton" href="#" onclick="buttonClick(event, 'menu9');" onmouseover="buttonMouseover(event, 'menu9');">Situatie Nave
		</a><a class="menuButton" href="#" onclick="buttonClick(event, 'menu9');" onmouseover="buttonMouseover(event, 'menu10');">Cautare
		</a><a class="menuButton" href="#" onclick="buttonClick(event, 'menu9');" onmouseover="buttonMouseover(event, 'menu12');">Contact
		</a>
	</div>
</div>

<!--== Prezentare =========================================================-->
		<div id="menu1" class="menu" onmouseover="menuMouseover(event)" style="z-index: 998; left: 451px; top: 176px; visibility: hidden;">
			<a class="menuItem" href="#" onmouseover="menuItemMouseover(event, 'menu1_3');">
				<span class="menuItemText">General info<img src="images/spacer.gif" border="0" height="10" width="30"><img src="images/global_arrow_right.gif" style="vertical-align: middle;" border="0"></span>
			</a>
			<a class="menuItem" href="#">
				<span class="menuItemText">Navigatie</span>
			</a>
			<a class="menuItem" href="#">
				<span class="menuItemText">Proiecte port</span>
			</a>
			<a class="menuItem" href="#">
				<span class="menuItemText">Harti port</span>
			</a>
		</div>

		<!-- Prezentare Submenu -------------------------------------------->
		<div id="menu1_3" class="menu" onmouseover="menuMouseover(event)" style="z-index: 999; left: 596px; top: 76px; visibility: hidden;">
			<a class="menuItem" href="#">Port maritim</a>
			<a class="menuItem" href="#">Port fluvial</a>
			<a class="menuItem" href="#">Porturi satelit</a>
		 </div>



		<!--- Conexiuni -------------------------------------------------------->
		<div id="menu5" class="menu" onmouseover="menuMouseover(event)" style="z-index: 999; left: 514px; top: 76px; visibility: hidden;">
			<a class="menuItem" href="#">Hinterland</a>
			<a class="menuItem" href="#">Linii regulate</a>
			<a class="menuItem" href="#">Intermodalism</a>
		</div>


		<!---- Terminale -------------------------------------------------------->
		<div id="menu6" class="menu" onmouseover="menuMouseover(event)" style="z-index: 999; left: 578px; top: 76px; visibility: hidden;">
			<a class="menuItem" href="#">Vrac lichid</a>
			<a class="menuItem" href="#">Vrac solid</a>
			<a class="menuItem" href="#">Containere</a>
			<a class="menuItem" href="#">Marfuri generale</a>
			<a class="menuItem" href="#">Ro-ro/ferry</a>
		</div>


		<!----Comunitate -------------------------------------------------------->
		<div id="menu7" class="menu" onmouseover="menuMouseover(event)" style="z-index: 999; left: 639px; top: 76px; visibility: hidden;">
			<a class="menuItem" href="#">Servicii</a>
			<a class="menuItem" href="#">Autoritati</a>
			<a class="menuItem" href="#">Asociatii</a>
			<a class="menuItem" href="#">Cadru legislativ</a>
			<a class="menuItem" href="#">Download</a>
		</div>


		<!---- Tarife port -------------------------------------------------------->
		<div id="menu11" class="menu" style="z-index: 999; left: 725px; top: 76px; visibility: hidden;">
			<a class="menuItem" href="#">Tarife de baza</a>
			<a class="menuItem" href="#">Autoritatea navala</a>
			<a class="menuItem" href="#">Pilotaj</a>
			<a class="menuItem" href="#">Remorcaj</a>
			<a class="menuItem" href="#">Legare/dezlegare</a>
			<a class="menuItem" href="#">Comisioane agenti</a>
		</div>

		<!---- Situatie nave -------------------------------------------------------->
		<div id="menu9" class="menu" onmouseover="menuMouseover(event)" style="z-index: 999; margin-left: -15px; left: 820px; top: 76px; visibility: hidden;" align="right">
			<a class="menuItem" href="#">Sosiri</a>
			<a class="menuItem" href="#">Plecari</a>
			<a class="menuItem" href="#">Sub operare</a>
		</div>




<!--...................................................................end menu.......................-->

