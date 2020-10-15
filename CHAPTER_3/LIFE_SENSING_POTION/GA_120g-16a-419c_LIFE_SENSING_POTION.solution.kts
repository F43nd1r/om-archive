
solution {
    puzzle = "P030b"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = 2 to 3
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 1 to 0
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 3
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 3
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 0 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(2)
                retract()
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                retract()
                extend()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                retract()
                extend()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                pivotClockwise()
                retract()
                drop()
                extend()
                grab()
                pivotClockwise()
                retract()
                drop()
                extend()
                grab()
                pivotClockwise()
                retract()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                retract()
                rotateClockwise()
                drop()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                rotateClockwise()
                wait(1)
                extend()
                extend()
                pivotClockwise()
                retract()
                pivotClockwise()
                retract()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                extend()
                extend()
                retract()
                reset()
            }
        }
        )
    }
}
