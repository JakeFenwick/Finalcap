document.getElementById("loan-form").addEventListener("submit", computeResults);

function computeResults(e) {
    const userAmount = document.getElementById("amount").value;
    const userInterest = document.getElementById("interest").value;
    const userYears = document.getElementById("years").value;

    // Calculate

    const principal = parseFloat(userAmount);
    const CalculateInterest = parseFloat(userInterest) / 100 / 12;
    const calculatedPayments = parseFloat(userYears) * 12;

    //Compute monthly Payment

    const x = Math.pow(1 + CalculateInterest, calculatedPayments);
    const monthly = (principal * x * CalculateInterest) / (x - 1);
    const monthlyPayment = monthly.toFixed(2);

    //Compute Interest

    const totalInterest = (monthly * calculatedPayments - principal).toFixed(2);

    //Compute Total Payment

    const totalPayment = (monthly * calculatedPayments).toFixed(2);

    //Show results

    document.getElementById("monthlyPayment").innerHTML = "$" + monthlyPayment;

    document.getElementById("totalInterest").innerHTML = "%" + totalInterest;

    document.getElementById("totalPayment").innerHTML = "$" + totalPayment;

    e.preventDefault();
}