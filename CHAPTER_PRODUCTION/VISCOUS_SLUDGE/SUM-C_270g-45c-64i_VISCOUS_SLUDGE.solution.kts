
solution {
    puzzle = "P080"
    name = "B CC"
    arm(PISTON) {
        number = 1
        position = 3 to 3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to 5
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -2 to 4
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -2 to 3
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -2 to 5
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = -2 to 2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to 6
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 0 to 4
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 2 to 3
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 6
        rotation = -1
    }
    track {
        position = -3 to 4
        positions = listOf(0 to 0, 0 to 1, 1 to 0, 1 to -1)
    }
    track {
        position = 3 to 2
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                back()
                back()
                drop()
                back()
                back()
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                back()
                grab()
                back()
                back()
                drop()
                back()
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                back()
                back()
                grab()
                back()
                back()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                extend()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(5)
                grab()
                retract()
                retract()
                back()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
