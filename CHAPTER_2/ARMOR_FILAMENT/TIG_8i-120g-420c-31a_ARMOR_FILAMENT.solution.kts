
solution {
    puzzle = "P020"
    name = "INSTRUCTIONS NO TRACK 15"
    arm(ARM6) {
        number = 1
        position = -2 to 1
        rotation = -4
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -2 to -1
        rotation = -5
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -3 to 1
        rotation = -5
    }
    glyph(PROJECTION) {
        position = -1 to 1
        rotation = -4
    }
    io(INFINITE) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(27)
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
            }
        }
        )
    }
}
