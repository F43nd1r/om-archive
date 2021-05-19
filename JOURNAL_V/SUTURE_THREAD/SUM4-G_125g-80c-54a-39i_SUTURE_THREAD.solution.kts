
solution {
    puzzle = "P085"
    name = "SUM4"
    arm(ARM1) {
        number = 1
        position = 0 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to 2
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 1
        rotation = 0
    }
    track {
        position = -2 to 2
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(6)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
            }
        }
        )
    }
}
