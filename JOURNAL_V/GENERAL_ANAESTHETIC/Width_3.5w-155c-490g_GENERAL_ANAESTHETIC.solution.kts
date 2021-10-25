
solution {
    puzzle = "P086"
    name = "W3.5"
    arm(ARM1) {
        number = 1
        position = -9 to -10
        rotation = -5
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -10 to -9
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -10 to -8
        rotation = -7
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -6 to -9
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -11 to -10
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -6 to -8
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -9 to -7
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = -8 to -6
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = -4 to -7
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -6 to -5
        rotation = -7
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = -5 to -4
        rotation = -6
        size = 3
    }
    arm(PISTON) {
        number = 12
        position = -5 to -3
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 2 to 0
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = -7 to -8
        rotation = -3
    }
    glyph(BONDER) {
        position = -6 to -7
        rotation = -3
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = -3
    }
    glyph(BONDER) {
        position = -1 to -4
        rotation = -3
    }
    glyph(ANIMISMUS) {
        position = -7 to -10
        rotation = -4
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to -11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to -11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -9 to -8
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = -5
    }
    io(INPUT) {
        index = 1
        position = -9 to -9
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -5 to -8
        rotation = 0
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 1, 0 to 2, 1 to 2, 1 to 3)
    }
    track {
        position = -11 to -10
        positions = listOf(0 to 1, 0 to 0, 0 to -1)
    }
    track {
        position = -7 to -5
        positions = listOf(3 to 2, 2 to 2, 2 to 1, 2 to 0, 1 to 0, 0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(7)
                repeat()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(35)
                grab()
                forward()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(16)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(5)
                grab()
                retract()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                extend()
                reset()
                wait(1)
                repeat()
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
                retract()
                reset()
                wait(1)
                extend()
                wait(3)
                grab()
                retract()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(10)
                grab()
                retract()
                retract()
                reset()
                wait(5)
                grab()
                retract()
                retract()
                reset()
                wait(2)
                grab()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                forward()
                wait(2)
                back()
                back()
                drop()
                retract()
                wait(2)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(4)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(21)
                forward()
                forward()
                grab()
                back()
                back()
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(11)
                forward()
                forward()
                grab()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
            }
        }
        )
    }
}
