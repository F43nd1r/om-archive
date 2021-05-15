
solution {
    puzzle = "P039"
    name = "CI"
    arm(ARM1) {
        number = 1
        position = 17 to -1
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 14 to -4
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 15 to 1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 17 to -2
        rotation = 2
        size = 2
    }
    arm(ARM3) {
        number = 5
        position = 13 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 14 to -6
        rotation = 1
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = 14 to -1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 15 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 14 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 15 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 14 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 17 to -4
        rotation = 0
    }
    track {
        position = 15 to 1
        positions = listOf(0 to 0, -1 to 0, -1 to 1)
    }
    track {
        position = 13 to -3
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 14 to -6
        positions = listOf(0 to 0, 0 to 1, -1 to 2, -2 to 2, -1 to 1)
    }
    track {
        position = 17 to -2
        positions = listOf(0 to 0, 0 to -1, -1 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                forward()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
            }
        }
        )
    }
}
