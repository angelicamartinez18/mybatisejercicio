DO $$
DECLARE
   
 v_record record;
 

BEGIN

 
  select * from consultarusuarios('gelou') into v_record;
	--v_total:=v_record.par_total;/

raise notice 'total usuarios:%',v_record.p_id;
raise notice 'codigo respuesta:%',v_record.p_codrta;
EXCEPTION
   WHEN OTHERS THEN
   RAISE NOTICE '[%]', SQLERRM;

END;
$$ 
