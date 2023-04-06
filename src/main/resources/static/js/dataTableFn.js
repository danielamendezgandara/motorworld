/**
 * 
 */
 
 // Da formato tablas usuarios y capacitaciones
 
 	//Data Table para listar capacitaciones
 	$('#table-orders').DataTable({
		responsive: true,
		sDom: 'lrtip',
		"ordering": false,
		//para cambiar el lenguaje a español
		"language": {
			"lengthMenu": "Mostrar _MENU_ registros",
			"zeroRecords": "No se encontraron resultados",
			"info": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
			"infoEmpty": "Mostrando registros del 0 al 0 de un total de 0 registros",
			"infoFiltered": "(filtrado de un total de _MAX_ registros)",
			"oPaginate": {
				"sFirst": "Primero",
				"sLast": "Último",
				"sNext": "Siguiente",
				"sPrevious": "Anterior",
			},
			"sProcessing": "Procesando...",
			
		}
	});
	
