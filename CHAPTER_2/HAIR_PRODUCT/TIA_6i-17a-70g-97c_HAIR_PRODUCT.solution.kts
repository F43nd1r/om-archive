
solution {
    puzzle = "P016"
    name = "INSTRUCTIONS NO TRACK 9"
    arm(ARM6) {
        number = 1
        position = -2 to 1
        rotation = -3
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = -1 to -1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
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
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
