
solution {
    puzzle = "P008"
    name = "B CX 6T"
    arm(ARM1) {
        number = 1
        position = 2 to -1
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 2 to -2
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to -1
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to -1
        rotation = -18
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 0 to -1
        rotation = -15
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -1 to -2
        rotation = -17
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -1 to -5
        rotation = -16
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -5 to -1
        rotation = -19
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -4 to -2
        rotation = -19
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = -18
    }
    glyph(BONDER) {
        position = 0 to -4
        rotation = -17
    }
    glyph(BONDER) {
        position = -2 to -3
        rotation = -18
    }
    glyph(CALCIFICATION) {
        position = 1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -4
        rotation = -20
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to -3
        rotation = 0
    }
    track {
        position = -5 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    track {
        position = -3 to -1
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 2 to -1
        positions = listOf(-1 to 1, -1 to 0, 0 to -1, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                forward()
                wait(1)
                forward()
                drop()
                forward()
                forward()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                forward()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                forward()
                grab()
                forward()
                forward()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                drop()
                forward()
                forward()
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                grab()
                forward()
                drop()
                forward()
                forward()
                forward()
                grab()
                forward()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
