function displayAlcoholBrands(){
    console.log("A")
    const req = new XMLHttpRequest();
    req.onreadystatechange = () => {
        // Example handle logic
        console.log("D")
        if (req.status === 200 && req.readyState === 4) {
            if (req.getResponseHeader("Content-Type") === "application/json") {
                console.log("oh look its some JSON: " + req.responseText);
                // adding an element to the body example
                // let elem = document.createElement('div');
                // elem.textContent = "hello world";
                // document.body.appendChild(elem);

            } else {
                console.log(
                    "Looks like its not JSON but lets see what it is... " + req.responseText
                );
            }
        } else {
            console.log("Oh no... handle error");
        }
    };
    console.log("B")
    req.open("GET", "http://localhost:8080/get_brands");
    console.log("C")
    req.send();

}