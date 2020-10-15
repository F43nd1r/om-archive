
solution {
    puzzle = "P107"
    name = "W3.5 6T"
    arm(PISTON) {
        number = 1
        position = 0 to -1
        rotation = 9
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -1 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -3 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -6 to -2
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -5 to -4
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = -9 to -5
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = -6 to -6
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -6 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = -8 to -6
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -6 to -5
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -5 to -2
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to -8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -7 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = -1
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 1, 0 to 0, -1 to 0, -1 to -1)
    }
    track {
        position = -9 to -7
        positions = listOf(0 to -1, 0 to 0, 0 to 1, 0 to 2)
    }
    track {
        position = -4 to -4
        positions = listOf(-1 to 0, -1 to -1, 0 to -1, 0 to 0, 1 to 0, 1 to 1, 2 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(6)
                grab()
                back()
                back()
                drop()
                forward()
                wait(1)
                grab()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                grab()
                back()
                back()
                reset()
                wait(15)
                grab()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(13)
                grab()
                retract()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                reset()
                wait(3)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(20)
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                wait(1)
                rotateCounterClockwise()
                extend()
                wait(8)
                retract()
                extend()
                drop()
                retract()
                reset()
                wait(6)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(19)
                grab()
                retract()
                back()
                back()
                drop()
                forward()
                grab()
                retract()
                back()
                forward()
                reset()
                wait(3)
                grab()
                retract()
                back()
                back()
                back()
                forward()
                drop()
                forward()
                grab()
                retract()
                reset()
                wait(3)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(4)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(13)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(10)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(10)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(15)
                grab()
                retract()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                reset()
                wait(6)
                grab()
                retract()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                forward()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
