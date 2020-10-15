
solution {
    puzzle = "P035"
    name = "W4.5 6T"
    arm(PISTON) {
        number = 1
        position = -4 to 1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -3 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 2
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = -1 to 3
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to 1
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 2 to 0
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 1 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 0 to 5
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 9
        position = 1 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = -6 to -7
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = -3
    }
    glyph(BONDER) {
        position = -3 to -4
        rotation = -4
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = -2 to -1
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = -6 to -2
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = -4 to -2
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -6 to -5
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 1
        rotation = 0
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    track {
        position = -7 to -8
        positions = listOf(0 to -1, 0 to 0, 1 to 0, 1 to 1)
    }
    track {
        position = -2 to 2
        positions = listOf(-3 to -3, -3 to -2, -2 to -2, -2 to -1, -1 to -1, -1 to 0, 0 to 0, 0 to 1, 1 to 1, 1 to 2, 2 to 2, 2 to 3)
    }
    track {
        position = 0 to 0
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(1)
                back()
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                drop()
                wait(3)
                forward()
                grab()
                forward()
                drop()
                wait(1)
                forward()
                wait(1)
                reset()
                wait(5)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(10)
                grab()
                back()
                back()
                back()
                reset()
                wait(4)
                grab()
                back()
                back()
                back()
                reset()
                wait(12)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                extend()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                back()
                retract()
                retract()
                wait(9)
                reset()
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(31)
                grab()
                back()
                wait(2)
                forward()
                back()
                back()
                back()
                reset()
                wait(17)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                back()
                grab()
                forward()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(10)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(11)
                back()
                back()
                grab()
                extend()
                reset()
                wait(6)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(11)
                back()
                back()
                grab()
                extend()
                back()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(21)
                back()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
                wait(18)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                back()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                drop()
                back()
                wait(4)
                forward()
                wait(1)
                forward()
                wait(1)
                grab()
                forward()
                reset()
                wait(5)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(1)
                back()
                wait(1)
                back()
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                wait(3)
                grab()
                forward()
                drop()
                forward()
                wait(2)
                forward()
                wait(1)
                reset()
                wait(5)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(13)
                grab()
                pivotClockwise()
                back()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                forward()
                back()
                back()
                back()
                drop()
                forward()
                grab()
                back()
                reset()
                wait(7)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                grab()
                pivotClockwise()
                back()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                forward()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(25)
                back()
                back()
                wait(1)
                grab()
                back()
                wait(2)
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                reset()
                wait(9)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(24)
                extend()
                back()
                back()
                grab()
                back()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
