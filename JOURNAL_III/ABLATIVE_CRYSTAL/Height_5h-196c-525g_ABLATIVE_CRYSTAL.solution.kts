
solution {
    puzzle = "P068"
    name = "H5 6T"
    arm(ARM1) {
        number = 1
        position = -6 to -2
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -5 to 2
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -4 to 2
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 0 to -2
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -1 to -2
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 0 to -1
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 2 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 6 to -2
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 3
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 5 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = 6 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 7 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 8 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 9 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -2 to 2
        rotation = 3
    }
    glyph(EQUILIBRIUM) {
        position = 10 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -7 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 0
        rotation = 0
    }
    track {
        position = -5 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -5 to 1
        positions = listOf(0 to 0, 0 to 1, 1 to 1, 1 to 0)
    }
    track {
        position = -1 to -3
        positions = listOf(1 to 2, 1 to 1, 0 to 1, -1 to 1, -1 to 2, 0 to 2)
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 7 to -2
        positions = listOf(3 to 0, 2 to 0, 1 to 0, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                reset()
                wait(8)
                grab()
                rotateClockwise()
                back()
                reset()
                wait(14)
                repeat()
                wait(29)
                repeat()
                wait(29)
                repeat()
                wait(29)
                repeat()
                wait(29)
                repeat()
                wait(29)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(9)
                forward()
                grab()
                extend()
                back()
                wait(1)
                back()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                extend()
                wait(1)
                retract()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                wait(8)
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                wait(4)
                forward()
                back()
                back()
                wait(7)
                grab()
                forward()
                retract()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                forward()
                extend()
                wait(4)
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                forward()
                grab()
                back()
                extend()
                drop()
                forward()
                wait(4)
                grab()
                back()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                forward()
                grab()
                back()
                extend()
                drop()
                forward()
                wait(4)
                grab()
                back()
                drop()
                retract()
                wait(4)
                forward()
                grab()
                extend()
                back()
                wait(1)
                back()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                extend()
                wait(1)
                retract()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                wait(8)
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                wait(4)
                forward()
                back()
                back()
                wait(7)
                grab()
                forward()
                retract()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                back()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                back()
                back()
                drop()
                rotateClockwise()
                back()
                wait(7)
                forward()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                wait(1)
                back()
                retract()
                rotateClockwise()
                wait(9)
                back()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                forward()
                reset()
                wait(6)
                repeat()
                wait(59)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                wait(4)
                forward()
                back()
                back()
                wait(7)
                grab()
                forward()
                retract()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                forward()
                extend()
                wait(4)
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                forward()
                grab()
                back()
                extend()
                drop()
                forward()
                wait(4)
                grab()
                back()
                drop()
                retract()
                wait(4)
                forward()
                grab()
                extend()
                back()
                wait(1)
                back()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                extend()
                wait(1)
                retract()
                pivotClockwise()
                drop()
                forward()
                reset()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(17)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                wait(4)
                retract()
                retract()
                back()
                forward()
                extend()
                extend()
                reset()
                wait(10)
                repeat()
                wait(29)
                repeat()
                wait(29)
                repeat()
                wait(29)
                repeat()
                wait(29)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                back()
                retract()
                rotateClockwise()
                wait(9)
                back()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                wait(5)
                back()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                back()
                back()
                drop()
                rotateClockwise()
                back()
                wait(7)
                forward()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
                wait(1)
                repeat()
                wait(59)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(36)
                grab()
                back()
                back()
                back()
                back()
                forward()
                forward()
                forward()
                wait(3)
                forward()
                reset()
                wait(17)
                repeat()
                wait(29)
                repeat()
                wait(29)
                repeat()
                wait(29)
                repeat()
                wait(29)
                grab()
                back()
                back()
                back()
                back()
                forward()
                forward()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
