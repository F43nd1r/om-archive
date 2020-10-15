
solution {
    puzzle = "P019"
    name = "B CX 2 2T"
    arm(ARM1) {
        number = 1
        position = -1 to 3
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to 0
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to 2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -3 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -3 to -3
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 1 to 0)
    }
    track {
        position = -2 to -3
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                back()
                wait(2)
                back()
                drop()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                back()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
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
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                wait(2)
                back()
                back()
                reset()
            }
        }
        )
    }
}
