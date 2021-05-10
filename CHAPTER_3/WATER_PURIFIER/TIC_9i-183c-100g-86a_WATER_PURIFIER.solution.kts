
solution {
    puzzle = "P025"
    name = "INSTRUCTIONS NO TRACK 10"
    arm(ARM6) {
        number = 1
        position = 2 to -1
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -4 to 1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to -1
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 2
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 2 to -4
        rotation = 0
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
            sequence(3) {
                wait(3)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
