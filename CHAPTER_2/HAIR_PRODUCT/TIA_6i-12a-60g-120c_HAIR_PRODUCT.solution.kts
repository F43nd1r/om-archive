
solution {
    puzzle = "P016"
    name = "INSTRUCTIONS NO TRACK 8"
    arm(ARM6) {
        number = 1
        position = -1 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
