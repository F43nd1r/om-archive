
solution {
    puzzle = "P030b"
    name = "H3 6T"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = -4
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -1 to 0
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -3 to 1
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -4 to 1
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -4 to -1
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -10 to -1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -11 to 1
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = -4
    }
    glyph(BONDER) {
        position = -8 to -1
        rotation = -4
    }
    glyph(BONDER) {
        position = -9 to 1
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = -7 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -10 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -2 to 0
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -11 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -8 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to -1
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(1 to 2, 0 to 2, 0 to 1, 0 to 0, 1 to 0)
    }
    track {
        position = -11 to -1
        positions = listOf(-1 to 0, 0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = -6 to 1
        positions = listOf(1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                wait(1)
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                back()
                back()
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                reset()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                back()
                back()
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                reset()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                back()
                back()
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                reset()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                back()
                back()
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                reset()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                back()
                back()
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                extend()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(14)
                forward()
                grab()
                back()
                back()
                back()
                forward()
                forward()
                reset()
                wait(7)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateClockwise()
                back()
                extend()
                drop()
                retract()
                forward()
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                back()
                extend()
                drop()
                retract()
                forward()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                back()
                extend()
                drop()
                retract()
                forward()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                back()
                extend()
                drop()
                retract()
                forward()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                back()
                extend()
                drop()
                retract()
                forward()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                back()
                extend()
                drop()
                retract()
                forward()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                wait(2)
                grab()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                wait(3)
                grab()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                wait(3)
                grab()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                wait(3)
                grab()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                wait(3)
                grab()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(7)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(7)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(7)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(7)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(7)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
