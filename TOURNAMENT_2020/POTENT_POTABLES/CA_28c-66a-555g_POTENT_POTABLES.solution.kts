
solution {
    puzzle = "w2501727721"
    name = "B CA 6T"
    arm(ARM1) {
        number = 1
        position = 1 to 5
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 6 to 0
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = 2 to 4
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 1 to 4
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to 5
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 8 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 7 to 2
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = 6 to 4
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = -2 to 3
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 10
        position = -2 to 4
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 11
        position = -3 to 4
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 12
        position = -3 to 3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 2 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = 1 to -1
        rotation = 1
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 5 to 4
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 3
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 2
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 4 to 3
        rotation = -1
    }
    track {
        position = -2 to 3
        positions = listOf(0 to -1, 0 to 0, 0 to 1, -1 to 1, -1 to 0)
    }
    track {
        position = 7 to 1
        positions = listOf(0 to 0, 0 to 1)
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
            sequence(6) {
                wait(4)
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
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(4)
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
            sequence(14) {
                wait(4)
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
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                retract()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                extend()
                wait(1)
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                retract()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(8)
                back()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                retract()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                extend()
                wait(7)
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(8)
                back()
                back()
                wait(3)
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                retract()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                extend()
                wait(4)
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
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
            sequence(7) {
                wait(4)
                grab()
                pivotCounterClockwise()
                back()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(8)
                grab()
                pivotCounterClockwise()
                extend()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
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
            sequence(10) {
                wait(5)
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                retract()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                extend()
                wait(1)
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
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
        )
    }
}
