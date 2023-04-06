 
     /* $(function () {
          $("#fecha").datepicker({dateFormat: 'dd-mm-yy'});
        }
      );*/
      
      
     /* tinymce.init({
          selector: '#detalles',
          plugins: "textcolor, table lists code",
          toolbar: " undo redo | bold italic | alignleft aligncenter alignright alignjustify \n\
                    | bullist numlist outdent indent | forecolor backcolor table code"
      });*/
      
   fetch("http://localhost:8080/api/order/all")
  .then((response) => response.json())
  .then((data) => console.log(data));