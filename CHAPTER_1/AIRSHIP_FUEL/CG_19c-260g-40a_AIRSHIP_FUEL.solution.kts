
solution {
    puzzle = "P008"
    name = "B CG 6T"
    arm(ARM1) {
        number = 1
        position = 5 to -3
        rotation = -9
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 4 to -3
        rotation = -9
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 4 to -2
        rotation = -9
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 3 to -1
        rotation = -16
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to 0
        rotation = -18
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 2 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -4 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -3 to 3
        rotation = -2
        size = 2
    }
    arm(ARM3) {
        number = 9
        position = -2 to 0
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = -19
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -18
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -18
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = -21
    }
    io(INPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 1
        rotation = 0
    }
    track {
        position = 5 to -3
        positions = listOf(0 to 1, -1 to 1, -1 to 0, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(2)
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
            sequence(4) {
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
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
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
            sequence(7) {
                wait(4)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        )
    }
}
