function repondQuestion(id){
	if(document.getElementById("idFav"+id).checked)
		texte = "Favori";	
	else
		document.getElementById("etat"+id).innerHTML = "Repondu";
}
function favQuestion(id){
	if(document.getElementById("idFav"+id).checked)
		texte = "Favori";	
	else if(document.getElementById("idQuestion"+id).checked)
		texte = "Repondu";	
	else
		texte = "Non repondu";
	
	document.getElementById("etat"+id).innerHTML = texte
}