create or replace function consultarUsuarios( p_name text, out p_id text, out p_codrta text)

RETURNS record
LANGUAGE 'plpgsql'
COST 100
VOLATILE
AS $BODY$

declare 


    c_consultarusuarios cursor for 
    select employee_id from employee where employee_name=p_name;


begin
    
	for consulta in c_consultarusuarios loop
	raise notice 'id de usuario:%',consulta.employee_id;
	p_id:=consulta.employee_id;
	end loop;
    p_codrta:='OK';
exception 
    
    WHEN others THEN
    p_codrta:='ERROR';
    
    
end;
$BODY$
;
