
solution {
    puzzle = "w2450512021"
    name = "H4  6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -13 to -1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to 0
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -14 to 1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -11 to 1
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -13 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -4 to 1
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -10 to -2
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -9 to -2
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 0 to 1
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -3 to 1
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = -4
    }
    glyph(BONDER) {
        position = -10 to 0
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = -3 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to -1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -5 to 0
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -12 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -6 to 1
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -7 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -12 to 1
        rotation = 1
    }
    track {
        position = -7 to -2
        positions = listOf(1 to 0, 0 to 0, -1 to 0, -2 to 0, -3 to 0)
    }
    track {
        position = -9 to 1
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = 1 to 1
        positions = listOf(-1 to 0, -2 to 0, -3 to 0, -4 to 0, -5 to 0, -6 to 0, -5 to -1, -4 to -1)
    }
    tape {
        parallel(
        {
            sequence(8) {
                grab()
                retract()
                rotateClockwise()
                back()
                back()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                wait(1)
                back()
                forward()
                forward()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                forward()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                forward()
                wait(2)
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                forward()
                forward()
                drop()
                wait(2)
                back()
                back()
                forward()
                forward()
                rotateCounterClockwise()
                wait(1)
                forward()
                grab()
                extend()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                pivotCounterClockwise()
                drop()
                wait(11)
                repeat()
                wait(12)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                pivotClockwise()
                forward()
                wait(1)
                pivotClockwise()
                wait(4)
                pivotCounterClockwise()
                wait(1)
                pivotClockwise()
                pivotCounterClockwise()
                wait(5)
                pivotClockwise()
                pivotCounterClockwise()
                wait(4)
                pivotClockwise()
                pivotCounterClockwise()
                wait(5)
                pivotClockwise()
                pivotCounterClockwise()
                wait(4)
                pivotClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                back()
                back()
                grab()
                forward()
                forward()
                reset()
                wait(1)
                repeat()
                wait(5)
                repeat()
                wait(5)
                back()
                back()
                wait(2)
                grab()
                forward()
                forward()
                reset()
                back()
                back()
                grab()
                forward()
                forward()
                reset()
                back()
                back()
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
        
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                retract()
                back()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                forward()
                forward()
                drop()
                forward()
                extend()
                wait(3)
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                wait(5)
                grab()
                retract()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                back()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                extend()
                reset()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(12)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                back()
                back()
                extend()
                extend()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                pivotCounterClockwise()
                forward()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(7)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(21)
                forward()
                grab()
                back()
                back()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
