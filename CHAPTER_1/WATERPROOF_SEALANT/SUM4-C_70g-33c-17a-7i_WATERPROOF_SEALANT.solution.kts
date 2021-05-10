
solution {
    puzzle = "P011"
    name = "SUM4"
    arm(ARM6) {
        number = 1
        position = 2 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 1 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 3 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
