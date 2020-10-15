
solution {
    puzzle = "P029"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = 8 to -6
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 5 to 0
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 7 to -6
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 2 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to -1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to -3
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 4 to 0
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 5 to -3
        rotation = -3
    }
    io(INFINITE) {
        index = 0
        position = -11 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 8 to -3
        rotation = 0
    }
    track {
        position = 0 to -3
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 6 to -4
        positions = listOf(0 to 0, 0 to -1, 1 to -2)
    }
    track {
        position = 4 to 0
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateCounterClockwise()
                back()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                back()
                back()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(13)
                grab()
                pivotClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
