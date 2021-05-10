
solution {
    puzzle = "P015"
    name = "INSTRUCTIONS NO TRACK 13"
    arm(ARM6) {
        number = 1
        position = 2 to 2
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = -2 to 3
        rotation = 1
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = 1 to 1
        rotation = -2
        size = 2
    }
    arm(ARM3) {
        number = 4
        position = 0 to -2
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -3
    }
    glyph(PROJECTION) {
        position = 1 to 3
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 3
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
