
solution {
    puzzle = "P041"
    name = "B CA"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -10 to 2
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -9 to 3
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -7 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -7 to -1
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -6 to -2
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 0 to -2
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -6 to -3
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -8 to 1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -10 to 4
        rotation = 5
        size = 3
    }
    arm(PISTON) {
        number = 10
        position = -10 to 5
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -8 to 5
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 12
        position = -6 to 4
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 13
        position = -8 to 6
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = -7 to 5
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = -12 to 4
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 16
        position = -4 to 4
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 17
        position = -4 to 3
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 18
        position = -3 to 2
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 19
        position = -2 to 1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -5 to 3
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to 2
        rotation = 2
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -6 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -3 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -9 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -8 to 3
        rotation = 1
    }
    glyph(ANIMISMUS) {
        position = -5 to -2
        rotation = 1
    }
    glyph(DISPOSAL) {
        position = -9 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -7 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -7 to 4
        rotation = 0
    }
    track {
        position = -4 to 3
        positions = listOf(-1 to 2, 0 to 1, 0 to 0, 1 to -1, 2 to -2)
    }
    track {
        position = 0 to -2
        positions = listOf(0 to -1, 0 to 0)
    }
    track {
        position = -6 to -1
        positions = listOf(-1 to 1, -1 to 0)
    }
    track {
        position = -11 to 5
        positions = listOf(1 to 0, 0 to 0, 1 to -1)
    }
    track {
        position = -11 to 2
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 2 to 1)
    }
    tape {
        parallel(
        {
            sequence(19) {
                wait(11)
                grab()
                back()
                forward()
                pivotClockwise()
                extend()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(10)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                back()
                retract()
                pivotClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(6)
                back()
                rotateClockwise()
                wait(2)
                forward()
                wait(1)
                back()
                wait(4)
                forward()
                back()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                back()
                reset()
                wait(1)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(15) {
                wait(6)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(2)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
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
            sequence(2) {
                wait(6)
                back()
                forward()
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                retract()
                retract()
                wait(2)
                extend()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                back()
                back()
                drop()
                wait(3)
                back()
                wait(4)
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(6)
                back()
                wait(3)
                grab()
                back()
                back()
                wait(1)
                retract()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(18) {
                wait(10)
                back()
                grab()
                retract()
                drop()
                extend()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(16) {
                wait(9)
                grab()
                back()
                wait(5)
                retract()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(17) {
                wait(5)
                grab()
                rotateCounterClockwise()
                wait(1)
                retract()
                drop()
                back()
                rotateClockwise()
                extend()
                wait(3)
                grab()
                forward()
                retract()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(7)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
