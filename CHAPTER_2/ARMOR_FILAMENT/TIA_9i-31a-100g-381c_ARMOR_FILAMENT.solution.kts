
solution {
    puzzle = "P020"
    name = "INSTRUCTIONS NO TRACK 12"
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
        position = -1 to 0
        rotation = -3
    }
    io(INFINITE) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(18)
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
