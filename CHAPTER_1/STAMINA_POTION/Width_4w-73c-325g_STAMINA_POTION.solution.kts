
solution {
    puzzle = "P015"
    name = "W4 6T"
    arm(ARM1) {
        number = 1
        position = 0 to 2
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to 1
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -1 to 1
        rotation = -8
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -4 to -5
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -7 to -3
        rotation = -6
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = -3 to -4
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -2 to 1
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = -7 to -2
        rotation = -6
        size = 1
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = -8
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -7
    }
    glyph(UNBONDER) {
        position = -3 to -2
        rotation = -6
    }
    glyph(PROJECTION) {
        position = -3 to 2
        rotation = -8
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -1
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = -5 to -4
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 2
        rotation = 0
    }
    track {
        position = -1 to 2
        positions = listOf(1 to -1, 0 to 0, 1 to 0)
    }
    track {
        position = -6 to -1
        positions = listOf(0 to 0, 0 to -1, -1 to -1, -1 to -2)
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(6)
                grab()
                retract()
                retract()
                rotateClockwise()
                extend()
                reset()
                wait(6)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                retract()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                extend()
                extend()
                retract()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                extend()
                extend()
                retract()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                extend()
                extend()
                retract()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                extend()
                extend()
                retract()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                extend()
                extend()
                retract()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                pivotClockwise()
                drop()
                wait(3)
                grab()
                pivotClockwise()
                drop()
                wait(3)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                drop()
                back()
                wait(61)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                back()
                grab()
                back()
                drop()
                forward()
                wait(4)
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                wait(4)
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                wait(4)
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                wait(4)
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                wait(4)
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                extend()
                rotateClockwise()
                wait(1)
                extend()
                reset()
                wait(6)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(1)
                back()
                repeat()
                wait(4)
                grab()
                pivotCounterClockwise()
                extend()
                extend()
                pivotClockwise()
                reset()
                wait(6)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(7)
                forward()
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                pivotClockwise()
                pivotClockwise()
                back()
                reset()
                wait(7)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        )
    }
}
