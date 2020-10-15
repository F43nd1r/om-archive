
solution {
    puzzle = "P041"
    name = "H4"
    arm(ARM1) {
        number = 1
        position = -3 to -1
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to 0
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -1 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 1 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -4 to -1
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -5 to -1
        rotation = 7
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -5 to 2
        rotation = 3
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 9
        position = -16 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = -14 to 1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = -13 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 12
        position = -13 to 1
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -10 to 1
        rotation = 3
    }
    glyph(BONDER) {
        position = -10 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -12 to 0
        rotation = 3
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = -15 to 0
        rotation = 6
    }
    glyph(ANIMISMUS) {
        position = -4 to 1
        rotation = 5
    }
    glyph(DISPOSAL) {
        position = 1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -9 to 1
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = -14 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -1
        rotation = 0
    }
    track {
        position = -2 to 2
        positions = listOf(1 to -2, 0 to -1, -1 to 0, -2 to 0, -3 to 0, -4 to 0)
    }
    track {
        position = -12 to 1
        positions = listOf(0 to 0, -1 to 1, -2 to 1, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
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
                wait(7)
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
            sequence(4) {
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
            sequence(6) {
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
            sequence(3) {
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
            sequence(7) {
                wait(8)
                grab()
                extend()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(2)
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                wait(2)
                grab()
                pivotCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(17)
                grab()
                back()
                back()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                wait(2)
                grab()
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                forward()
                forward()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(11)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                wait(6)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(9)
                grab()
                back()
                back()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                reset()
                wait(2)
                grab()
                back()
                back()
                reset()
                wait(2)
                grab()
                back()
                reset()
                wait(2)
                back()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(11)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(18)
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
