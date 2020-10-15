
solution {
    puzzle = "P019"
    name = "B CG 2T"
    arm(ARM1) {
        number = 1
        position = 2 to 1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 1 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to -2
        rotation = 7
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -4 to 2
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -4 to 4
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -3 to 3
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 5
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 5
    }
    glyph(MULTI_BONDER) {
        position = -2 to 1
        rotation = 6
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 0
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = 0 to 1
        rotation = 0
    }
    track {
        position = -3 to 3
        positions = listOf(-1 to 1, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
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
            sequence(5) {
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                back()
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
            }
        }
        )
    }
}
