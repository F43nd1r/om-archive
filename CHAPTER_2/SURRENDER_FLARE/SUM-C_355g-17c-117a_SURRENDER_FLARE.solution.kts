
solution {
    puzzle = "P022"
    name = "B CG 6T"
    arm(ARM1) {
        number = 1
        position = -5 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -1 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 0 to 2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 0 to 1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -1 to 1
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 1 to -6
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -3 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 0 to -5
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 1 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 1 to 0
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 3 to -5
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 7 to -1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to 5
        rotation = 5
    }
    glyph(PROJECTION) {
        position = 1 to -2
        rotation = 5
    }
    glyph(PROJECTION) {
        position = -2 to 5
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -4 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 2
        rotation = 0
    }
    track {
        position = -1 to 2
        positions = listOf(0 to 0, 1 to -1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                forward()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(9) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(13) {
                wait(6)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
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
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                forward()
            }
        }
        )
    }
}
