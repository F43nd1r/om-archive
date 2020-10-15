
solution {
    puzzle = "P012"
    name = "B CG 1 2T"
    arm(ARM1) {
        number = 1
        position = -3 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to 4
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to 3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 2 to -1
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -1 to 3
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 6
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to 4
        rotation = 0
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    tape {
        parallel(
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
            sequence(3) {
                wait(1)
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
                wait(2)
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                drop()
                rotateCounterClockwise()
                forward()
                wait(1)
                grab()
                forward()
                rotateClockwise()
                forward()
            }
        }
        )
    }
}
