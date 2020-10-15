
solution {
    puzzle = "P069"
    name = "B CA 6T"
    arm(PISTON) {
        number = 1
        position = -2 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -4 to -4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -3 to -4
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -1 to -5
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to 0
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -5 to -2
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -7 to 1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -6 to -1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 1 to -5
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 10
        position = 3 to -4
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 11
        position = -2 to 1
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = -5 to 2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = -5 to 1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 14
        position = -4 to 2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = -4 to 1
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 16
        position = 2 to -1
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 17
        position = 3 to -2
        rotation = 3
        size = 2
    }
    arm(ARM3) {
        number = 18
        position = 0 to -2
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = 2 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to -3
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -2 to -3
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -2 to -1
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -4
        rotation = 2
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -2
        rotation = 2
    }
    io(OUTPUT) {
        index = 2
        position = -3 to -2
        rotation = 1
    }
    io(OUTPUT) {
        index = 3
        position = -6 to 0
        rotation = 1
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
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
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
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
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
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
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
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
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
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
                extend()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
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
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(14) {
                wait(5)
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(18) {
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(16) {
                wait(5)
                grab()
                retract()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(17) {
                wait(7)
                grab()
                retract()
                reset()
                wait(1)
                repeat()
                wait(3)
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
                wait(7)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                grab()
                retract()
                retract()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(15) {
                wait(8)
                back()
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                wait(1)
                repeat()
                wait(7)
                repeat()
            }
        }
        )
    }
}
