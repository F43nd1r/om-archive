
solution {
    puzzle = "P012"
    name = "OAC"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 0 to 2
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -1 to 2
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 2
        rotation = 0
    }
    track {
        position = -1 to 2
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                drop()
                wait(1)
                grab()
                retract()
                drop()
                extend()
            }
        }
        )
    }
}
