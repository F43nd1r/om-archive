
solution {
    puzzle = "P040"
    name = "W4.5 6T"
    arm(PISTON) {
        number = 1
        position = -5 to -7
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -7 to -7
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -6 to -5
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to -2
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -1 to -5
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = -4 to -3
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -2 to -2
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -3 to -1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 2 to 3
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 10
        position = 0 to 3
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = -3 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = -5 to -6
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to -5
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -5
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
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to -7
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = 0 to -4
        rotation = 0
    }
    track {
        position = -1 to -4
        positions = listOf(-1 to 1, 0 to 0, 0 to -1)
    }
    track {
        position = 3 to 3
        positions = listOf(-1 to 0, -1 to -1, -2 to -1, -3 to 0)
    }
    track {
        position = -7 to -6
        positions = listOf(0 to 0, 0 to 1, -1 to 1, -1 to 0, 0 to -1)
    }
    track {
        position = -2 to 0
        positions = listOf(-1 to 0, -1 to -1, -2 to -1)
    }
    track {
        position = -1 to -1
        positions = listOf(1 to -2, 0 to -1, 0 to 0, -1 to 0, -1 to -1, -2 to -1, -3 to -1, -4 to -1, -3 to -2, -4 to -2, -4 to -3, -5 to -3, -6 to -3, -5 to -4, -5 to -5, -4 to -6)
    }
    tape {
        parallel(
        {
            sequence(9) {
                wait(29)
                forward()
                grab()
                back()
                reset()
                wait(20)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                wait(1)
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                back()
                reset()
                wait(12)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(18)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                retract()
                back()
                rotateClockwise()
                grab()
                back()
                extend()
                extend()
                pivotClockwise()
                reset()
                wait(9)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                retract()
                back()
                rotateClockwise()
                wait(1)
                grab()
                back()
                extend()
                extend()
                pivotClockwise()
                reset()
                wait(9)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                retract()
                back()
                rotateClockwise()
                wait(1)
                grab()
                back()
                extend()
                extend()
                pivotClockwise()
                reset()
                wait(9)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                retract()
                back()
                rotateClockwise()
                wait(1)
                grab()
                back()
                extend()
                extend()
                pivotClockwise()
                reset()
                wait(9)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                retract()
                back()
                rotateClockwise()
                wait(1)
                grab()
                back()
                extend()
                extend()
                pivotClockwise()
                reset()
                wait(9)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                retract()
                back()
                rotateClockwise()
                wait(1)
                grab()
                back()
                extend()
                extend()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                back()
                reset()
                wait(1)
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                wait(2)
                forward()
                rotateCounterClockwise()
                back()
                reset()
                wait(1)
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                wait(2)
                forward()
                rotateCounterClockwise()
                back()
                reset()
                wait(1)
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                wait(2)
                forward()
                rotateCounterClockwise()
                back()
                reset()
                wait(1)
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                wait(2)
                forward()
                rotateCounterClockwise()
                back()
                reset()
                wait(1)
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                wait(2)
                forward()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(12)
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                forward()
                forward()
                retract()
                retract()
                wait(1)
                back()
                grab()
                back()
                wait(2)
                forward()
                reset()
                wait(4)
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                forward()
                forward()
                retract()
                retract()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                back()
                wait(1)
                forward()
                reset()
                wait(4)
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                forward()
                forward()
                retract()
                retract()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                back()
                wait(1)
                forward()
                reset()
                wait(4)
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                forward()
                forward()
                retract()
                retract()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                back()
                wait(1)
                forward()
                reset()
                wait(4)
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                forward()
                forward()
                retract()
                retract()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                back()
                wait(1)
                forward()
                reset()
                wait(4)
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                forward()
                forward()
                retract()
                retract()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                back()
                wait(1)
                forward()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                retract()
                forward()
                forward()
                drop()
                forward()
                wait(5)
                reset()
                wait(3)
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                wait(1)
                grab()
                retract()
                forward()
                forward()
                drop()
                forward()
                wait(5)
                reset()
                wait(5)
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                wait(1)
                grab()
                retract()
                forward()
                forward()
                drop()
                forward()
                wait(5)
                reset()
                wait(5)
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                wait(1)
                grab()
                retract()
                forward()
                forward()
                drop()
                forward()
                wait(5)
                reset()
                wait(5)
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                wait(1)
                grab()
                retract()
                forward()
                forward()
                drop()
                forward()
                wait(5)
                reset()
                wait(5)
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                wait(1)
                grab()
                retract()
                forward()
                forward()
                drop()
                forward()
                wait(5)
                reset()
                wait(5)
                extendTape()
            }
        }
        , 
        {
            sequence(10) {
                wait(22)
                grab()
                retract()
                back()
                retract()
                rotateClockwise()
                wait(4)
                extend()
                retract()
                reset()
                wait(12)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                back()
                drop()
                wait(5)
                back()
                back()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                forward()
                reset()
                wait(2)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(12)
                grab()
                forward()
                retract()
                drop()
                wait(13)
                reset()
                wait(4)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                back()
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                pivotClockwise()
                extend()
                back()
                reset()
                wait(8)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
            }
        }
        )
    }
}
