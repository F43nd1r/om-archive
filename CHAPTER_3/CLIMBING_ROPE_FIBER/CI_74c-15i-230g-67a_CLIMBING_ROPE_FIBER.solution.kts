
solution {
    puzzle = "P027"
    name = "B CI15"
    arm(ARM6) {
        number = 1
        position = -2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -3 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to 3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to -1
        rotation = 1
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    track {
        position = -3 to 3
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 0 to -1
        positions = listOf(12 to 0, 11 to 0, 10 to 0, 9 to 0, 8 to 0, 7 to 0, 6 to 0, 5 to 0, 4 to 0, 3 to 0, 2 to 0, 1 to 0, 0 to 0, -1 to 0)
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
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                back()
                back()
                wait(2)
                forward()
            }
        }
        )
    }
}
