
solution {
    puzzle = "P022"
    name = "CI"
    arm(ARM6) {
        number = 1
        position = 0 to -4
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = -4 to 1
        rotation = -1
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = 3 to 1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -5 to 0
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = 5 to 0
        rotation = -3
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = 4 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -5 to 6
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -1 to 6
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -6 to 6
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -6 to 5
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 0 to 6
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 1 to 5
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = -5 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 3
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -3 to 2
        rotation = -1
    }
    glyph(PROJECTION) {
        position = 1 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 6
        rotation = 0
    }
    track {
        position = -6 to 6
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = 0 to 6
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(7) {
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
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(1)
                grab()
                rotateClockwise()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(10) {
                wait(1)
                forward()
                rotateCounterClockwise()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(3)
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                rotateClockwise()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(12) {
                wait(3)
                forward()
                rotateClockwise()
                wait(1)
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
