# language: es

Característica: Como usuario deseo realizar una reserva de un vuelo en la agencia Despegar
  para validar el mensaje de finalizacion

  Escenario: Reserva de vuelo

    Dado que Verena se encuentra en el sitio despegar
    Cuando ingrese los datos del vuelo
    Y seleccione el primer vuelo disponible
    Entonces el usuario podra ver el anuncio de "¡Falta poco! Completa tus datos y finaliza tu compra"