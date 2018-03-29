package ic3re.healthmetrics.bcclientinterface.exception;


import ic3re.healthmetrics.bcclientinterface.dto.Dto;

public class NotFoundException extends ServiceException {

    private static final long serialVersionUID = 1286777335134616391L;

    // different types on this exception exist
    private int errorId = NOT_FOUND_EXCEPTION;

    public NotFoundException(Dto dto) {
        super("Could not find:" + dto.getClass().getSimpleName(),
                "The requested Object of type " + dto.getClass().getName() + " satisfying " + dto.toString() + " was not found.");
        this.errorId = ENTITY_NOT_FOUND_EXCEPTION;
    }

    public NotFoundException(){
        super("Entity not found");
        this.errorId = RESOURCE_NOT_FOUND_EXCEPTION;
    }

    public NotFoundException(String msg) {
        super(msg);
        this.errorId = RESOURCE_NOT_FOUND_EXCEPTION;
    }

    @Override
    protected int errorId() {
        return errorId;
    }
}
