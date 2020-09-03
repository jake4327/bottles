function displayAlcoholBrands(){
    console.log("A")
    const req = new XMLHttpRequest();
    req.onreadystatechange = () => {
        // Example handle logic
        console.log("D")
        if (req.status === 200 && req.readyState === 4) {
            if (req.getResponseHeader("Content-Type") === "application/json") {
                console.log("oh look its some JSON: " + req.responseText);
                //adding an element to the body example
                /*let elem = document.createElement('div');
                elem.textContent = "hello world";
                document.body.appendChild(elem);*/

                let stuff = JSON.parse(req.response);
                stuff.forEach(el => {
                    // console.log(el); // prints whole element
                    // console.log(el.name); // allows access to specific value
                    let bottles = el.bottles;
                    console.log("Bottles",bottles);
                    // adding title to the body of the page
                    let elem = document.createElement('div');
                    let header = document.createElement('h1');
                    header.textContent = "Alcohol Brand Name: " + el.name;
                    elem.appendChild(header);
                    console.log(el);
                    el.bottles.forEach(bottle => {
                        console.log(bottle) // print all notes for each notebook
                        let title = document.createElement('p');
                        let description = document.createElement('p');
                        title.textContent = "Title: " + bottle.name;

                        elem.appendChild(title);
                        elem.appendChild(description);
                    })
                    document.body.appendChild(elem);
                });

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