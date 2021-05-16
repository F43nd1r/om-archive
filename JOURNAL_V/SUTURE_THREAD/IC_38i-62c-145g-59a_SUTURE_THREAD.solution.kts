
solution {
    puzzle = "P085"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = -1 to 2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to 0
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -1 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to 1
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -3 to 2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -1
        rotation = 0
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
