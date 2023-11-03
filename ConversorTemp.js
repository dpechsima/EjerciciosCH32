function convertirTemperatura() {
    let inputCelsius;
    let isInputValid = false;
    inputCelsius = prompt("Ingresa la temperatura en grados Celsius:");

    // Convertir la temperatura de grados Celsius a grados Fahrenheit y Kelvin
    const fahrenheit = (celsius * 9/5) + 32;
    const kelvin = celsius + 273.15;
  
    // Imprimir los resultados por consola
    console.log(`Temperatura en grados Fahrenheit: ${fahrenheit} °F`);
    console.log(`Temperatura en Kelvin: ${kelvin} K`);
  
  }
  
  // Llama a la función para iniciar el programa
  convertirTemperatura();
  