
solution {
    puzzle = "P036"
    name = "B CA"
    arm(ARM1) {
        number = 1
        position = 0 to -6
        rotation = 6
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to -3
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 2 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 3 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 5 to -6
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 6
        position = 3 to -4
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 6 to -6
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 8
        position = 4 to -4
        rotation = 5
        size = 1
    }
    arm(ARM2) {
        number = 9
        position = 0 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 2 to -6
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = 6 to -3
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 12
        position = 4 to -1
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 13
        position = -1 to 0
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = 1 to -1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 15
        position = -1 to -1
        rotation = 5
        size = 1
    }
    glyph(PURIFICATION) {
        position = 5 to -4
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 4 to -6
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = 1 to -4
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 2 to -3
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 1 to -2
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = 0 to -5
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 2 to -1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 5 to -3
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = 5 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 1 to -6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(6) {
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
            sequence(7) {
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
            sequence(11) {
                wait(5)
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
            sequence(10) {
                wait(5)
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
            sequence(12) {
                wait(5)
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
            sequence(15) {
                wait(10)
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
                retract()
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
            sequence(13) {
                wait(15)
                grab()
                retract()
                reset()
                wait(3)
                repeat()
                wait(3)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(11)
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
            sequence(3) {
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
        )
    }
}
