// TaskSeven

	for(let number = 1; number <= 10; number++) {
	    if (number % 4 == 0) {
		let sum = 0;
	      for(let numbers = 1; numbers <= 5; numbers++) {
		 sum += Math.floor(Math.pow(number, numbers));
}
	console.log(sum + " ");
}
}