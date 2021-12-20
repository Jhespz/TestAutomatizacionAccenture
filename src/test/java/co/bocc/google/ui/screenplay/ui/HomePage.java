/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package co.bocc.google.ui.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:home.page")
public class HomePage extends PageObject {

	private HomePage() {
		super();
	}

	public static final Target ORIGIN_CITY = Target.the("Campo para ingresar la ciudad de origen").located(
			By.xpath("//input[@class=\"input-tag\"][1]"));

	public static final Target CLOSE_POPUP = Target.the("Campo cerrar la ventana de pop-up").located(
			By.xpath("//i[@class=\"tooltip-close dreck-3-icon-close incentive-close\"]"));

	public static final Target LIST_CITY_OPTIONS = Target.the("Campo para de ventana seleccionar la ciudad").located(
			By.xpath("//div[@class=\"ac-container\"][1]"));

	public static final Target CITY_ACTIVE = Target.the("Campo para seleccionar la primer ciudad de la lista").located(
			By.xpath("//li[@class=\"item -active\"]"));

	public static final Target DESTINATION_CITY = Target.the("Campo para ingresar la ciudad de destino").located(
			By.xpath("//input[@placeholder=\"Ingresa hacia dónde viajas\"]"));

	public static final Target DEPARTURE_DAY = Target.the("Campo para ingresar la fecha de salida").located(
			By.xpath("//div[contains(text(),'17')][1]/parent::div[@class='sbox5-monthgrid-datenumber']"));

	public static final Target ARRIVED_DAY = Target.the("Campo para ingresar la fecha de llegada").located(
			By.xpath("/html/body/div[5]/div[1]/div[1]/div[2]/div[1]/div[3]/div[18]"));

	public static final Target DATES = Target.the("Campo para seleccionar el campo de ida en las fechas").located(
			By.xpath("//*[@placeholder='Ida'][1]"));

	public static final Target DATES_1 = Target.the("Campo para seleccionar el campo de vuelta en las fechas").located(
			By.xpath("//*[@placeholder='Vuelta'][1]"));

	public static final Target BTN_SEARCH = Target.the("Botón para darle click a buscar vuelos").located(
			By.xpath("//*[(text()='Buscar')]"));

	public static final Target BTN_SELECT = Target.the("Botón para seleccionar el primer vuelo disponible").located(
			By.xpath("//*[(text()='Seleccionar')]"));

	public static final Target BTN_CONTINUE = Target.the("Botón para continuar con el proceso de reserva").located(
			By.xpath("//*[(text()='Continuar')]"));

	public static final Target TXT_FINISH_BOOK = Target.the("Campo para validar el texto del último paso").located(
			By.xpath("//*[(text()=' ¡Falta poco! Completa tus datos y finaliza tu compra ')]"));

}
