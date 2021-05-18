
solution {
    puzzle = "P062"
    name = "TI"
    arm(ARM3) {
        number = 1
        position = 1 to -3
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 3 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to -3
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 4 to -4
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 2 to -4
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -26 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
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
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
