
solution {
    puzzle = "P040"
    name = "B CA"
    arm(PISTON) {
        number = 1
        position = 1 to -6
        rotation = 7
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 1 to -5
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to 2
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to 0
        rotation = 8
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -2 to 1
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -1 to 2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -3 to 2
        rotation = 6
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = 4 to -2
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 9
        position = 5 to -3
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 10
        position = 0 to -3
        rotation = 6
        size = 1
    }
    arm(PISTON) {
        number = 11
        position = -2 to -4
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = -1 to -4
        rotation = 6
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -1 to -1
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to -2
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = 2 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 1 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 1
        rotation = 0
    }
    track {
        position = 0 to -4
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -2 to 2
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = 5 to -2
        positions = listOf(-1 to -1, -1 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(10) {
                wait(6)
                grab()
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(6)
                grab()
                retract()
                rotateCounterClockwise()
                retract()
                back()
                drop()
                forward()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(8)
                grab()
                back()
                rotateCounterClockwise()
                reset()
                wait(6)
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
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                back()
                reset()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                back()
                extend()
                wait(8)
                back()
            }
        }
        , 
        {
            sequence(9) {
                wait(9)
                back()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                back()
                extend()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                reset()
                wait(7)
                repeat()
            }
        }
        )
    }
}
